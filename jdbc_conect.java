import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class jdbc_conect {
    Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/classicmodels","root","Almant0693734567");

    public jdbc_conect() throws SQLException {
    }

    public List<Employee> employeeList() throws SQLException {
       Statement statement = connection.createStatement();
        List<Employee> employeeList = new ArrayList<>();

        ResultSet resultSet = statement.executeQuery("select * from employee;");
        while (resultSet.next()){
            employeeList.add(new Employee(resultSet.getInt(1),resultSet.getString(2),resultSet.getDate(3),resultSet.getInt(4)));
        }

        return employeeList;
    }

    public void AddEmployee(Employee employee) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into employee values (?,?,?,?)");
        preparedStatement.setInt(1,employee.getId());
        preparedStatement.setString(2,employee.getOccupation());
        preparedStatement.setDate(3, new java.sql.Date(employee.getWorking_date().getTime()));
        preparedStatement.setInt(4,employee.getWorking_time());

        preparedStatement.addBatch();
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }
}
