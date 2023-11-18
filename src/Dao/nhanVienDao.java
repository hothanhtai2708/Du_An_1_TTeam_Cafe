/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import JavaConnection.DataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ui.nhanVien;

/**
 *
 * @author My MSI
 */
public class nhanVienDao extends EduSysDAO<nhanVien, String> {

    @Override
    public void insert(nhanVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(nhanVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<nhanVien> selectAll() {
        String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public nhanVien selectById(String key) {
        String SELECT_BY_ID = "SELECT * FROM nhanVien WHERE maNV=?";
        List<nhanVien> list = this.selectBySql(SELECT_BY_ID, key);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<nhanVien> selectBySql(String sql, Object... args) {
        List<nhanVien> list = new ArrayList<>();
        try {
            Connection connection = DataBaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Thiết lập các tham số nếu có
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i + 1, args[i]);
            }

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                nhanVien nv = new nhanVien();
                nv.setMaNV(rs.getString("maNV"));
                nv.setTenNV(rs.getString("tenNV"));
                nv.setGioiTinh(rs.getBoolean("gioiTinh"));
                nv.setChuVu(rs.getString("chucVu"));
                nv.setNgayVaoLam(rs.getDate("ngayVaoLam"));
                nv.setDiaChi(rs.getString("diaChi"));
                nv.setSoDT(rs.getString("soDT"));
                nv.setPhanQuyen(rs.getBoolean("phanQuyen"));
                nv.setMatKhau(rs.getString("matKhau"));

                list.add(nv);
            }

            // Đóng ResultSet, PreparedStatement và Connection
            rs.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
