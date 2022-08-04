

import lombok.*;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Employee {
    private Integer id;
    private String occupation;
    private Date working_date;
    private Integer working_time;

}
