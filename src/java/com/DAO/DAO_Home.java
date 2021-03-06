/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.DB.Util.ConnectionPool;
import com.DB.Util.DBUtil;
import com.basher.model.BasherModel;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Part;
import static jdk.nashorn.internal.objects.NativeError.getFileName;

/**
 *
 * @author user
 */
public class DAO_Home {

    PreparedStatement ps = null;
    ResultSet rs;

    public void insertHome(BasherModel bm) {

        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();

        String insert_home = " INSERT INTO `home`(`title`, `article`) VALUES (?,?)";

        try {
            ps = conn.prepareStatement(insert_home);
            ps.setString(1, bm.getTitle());
            ps.setString(2, bm.getArticle());
//            ps.setTimestamp(3, bm.getDate_modified());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(conn);
        }

    }

    public void updateHome(BasherModel bm) {

        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();

        String update_home = " UPDATE `home` SET `title`=?,`article`=?,`picture`=?,`date_modified`=? WHERE id =?";

        try {
            ps = conn.prepareStatement(update_home);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(conn);
        }

    }

    public void deleteHome() {

        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();

        String delete_home = "DELETE FROM `home` WHERE id=?";

        try {
            ps = conn.prepareStatement(delete_home);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(conn);
        }

    }

    public void deleteHome_by_id(String update_id) {

        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();

        String delete_home = "DELETE FROM `home` WHERE id=?";

        try {
            ps = conn.prepareStatement(delete_home);
            ps.setString(1, update_id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(conn);
        }

    }

    public void add_Home(BasherModel bash, Part filePart) {

        InputStream inputStream = null;

        if (filePart != null) {
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());

            try {
                // obtains input stream of the upload file
                inputStream = filePart.getInputStream();
            } catch (IOException ex) {
                Logger.getLogger(DAO_Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();

        String add_home = "INSERT INTO home(\n"
                + "            picture,title,article,file_name)\n"
                + "    VALUES ( ?,?,?,?);";

        try {
            ps = conn.prepareStatement(add_home);
            ps.setBlob(1, inputStream);
            ps.setString(2, bash.getTitle());
            ps.setString(3, bash.getArticle());
            ps.setString(4, bash.getFile_name());

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(conn);
        }

    }

    public void update_Home_by_id(BasherModel bash, String update_id) {

        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();

        String update_home = "UPDATE home\n"
                + "   SET title=?, \n"
                + "       article=?\n"
                + " WHERE id=?;";

        try {
            ps = conn.prepareStatement(update_home);
            ps.setString(1, bash.getTitle());
            ps.setString(2, bash.getArticle());
            ps.setString(3, update_id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(conn);
        }

    }

    public void update_Home_by_id_with_picture(BasherModel bash, String update_id, Part filePart) {
        InputStream inputStream = null;

        if (filePart != null) {
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());

            try {
                // obtains input stream of the upload file
                inputStream = filePart.getInputStream();
            } catch (IOException ex) {
                Logger.getLogger(DAO_Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();

        String update_home = "UPDATE home\n"
                + "   SET picture=?, \n"
                + "       title=?, article=?,file_name=?\n"
                + " WHERE id=?;";

        try {
            ps = conn.prepareStatement(update_home);
            ps.setBlob(1, inputStream);
            ps.setString(2, bash.getTitle());
            ps.setString(3, bash.getArticle());
            ps.setString(4, bash.getFile_name());
            ps.setString(5, update_id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(conn);
        }

    }

    public List<BasherModel> getDetailsForHome() throws SQLException {
        List<BasherModel> abouts = new ArrayList<>();
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        String query = "SELECT id,title,article,date_modified,file_name FROM home order by date_modified desc";

        Statement statement = conn.createStatement();

        try {
            rs = statement.executeQuery(query);

            while (rs.next()) {
                BasherModel about = new BasherModel();

                about.setId(rs.getString("id"));
//                about.(rs.getTimestamp("picture"));
                about.setTitle(rs.getString("title"));
                about.setArticle(rs.getString("article"));
                about.setDate_modified(rs.getTimestamp("date_modified"));
                about.setFile_name(rs.getString("file_name"));

                abouts.add(about);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(conn);
        }
        return abouts;

    }

    public void UpdateWorkOrderFileStatus(int id, boolean isthereFiles) {
        BasherModel wo = new BasherModel();
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "UPDATE home\n"
                + "SET picture=?\n"
                + "WHERE id=?;";
        try {
            ps = conn.prepareStatement(query);

            ps.setBoolean(1, isthereFiles);
            ps.setInt(2, 2);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {

            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(conn);
        }

    }

}
