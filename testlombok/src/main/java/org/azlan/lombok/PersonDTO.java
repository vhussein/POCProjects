package org.azlan.lombok;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by MohdAzlan.Hussein on 29-May-17.
 */

@Data
public class PersonDTO {

    private String firstName;
    private String secondName;
    private Date dateOfBirth;
    private String profession;
    private BigDecimal salary;
}
