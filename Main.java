import java.sql.SQLException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws SQLException {
        jdbc_conect jd = new jdbc_conect();

        jd.AddEmployee(new Employee(jd.employeeList().size()+1,"software developer3", new Date(), 5));

        jd.employeeList().forEach(employee -> System.out.println(employee));
    }
}
