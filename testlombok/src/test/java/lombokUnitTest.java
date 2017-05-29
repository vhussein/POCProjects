import org.azlan.lombok.PersonDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by MohdAzlan.Hussein on 29-May-17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Appconfig.class})
public class lombokUnitTest {


    @Test
    public void testSetterGetterLombok()
    {
        PersonDTO personObj = new PersonDTO();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr = "29/05/2017";
        Date dob = null;
        try {
            dob = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        personObj.setFirstName("SABU");
        personObj.setSecondName("TEST");
        personObj.setDateOfBirth(dob);
        personObj.setProfession("TESTADMIN");
        personObj.setSalary(BigDecimal.valueOf(1000));


        System.out.println(personObj.toString());
    }
}
