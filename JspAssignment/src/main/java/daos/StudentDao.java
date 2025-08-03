package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.Student;

public class StudentDao {

    Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "12345678");
    }

    public void insertStudent(Student student) throws Exception {
        Connection con = getConnection();
        String sql = "INSERT INTO student (name, email) VALUES (?, ?)";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1, student.getName());
        st.setString(2, student.getEmail());
        st.executeUpdate();
        con.close();
    }

    public List<Student> getAllStudents() throws Exception {
        List<Student> list = new ArrayList<>();
        Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM student");

        while (rs.next()) {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setEmail(rs.getString("email"));
            list.add(student);
        }

        con.close();
        return list;
    }
}