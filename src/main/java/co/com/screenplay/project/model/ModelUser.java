package co.com.screenplay.project.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ModelUser {
    private String First_Name;
    private String Last_Name;
    private String Address;
    private String City;
    private String State;
    private String Zip_Code;
    private String Phone;
    private String SSN;
    private String Username;
    private String Password;
    private String Confirm;


    public ModelUser(List<List<String>> data) {
        this.First_Name = data.get(1).get(0);
        this.Last_Name = data.get(1).get(1);
        this.Address = data.get(1).get(2);
        this.City = data.get(1).get(3);
        this.State = data.get(1).get(4);
        this.Zip_Code = data.get(1).get(5);
        this.Phone = data.get(1).get(6);
        this.SSN = data.get(1).get(7);
        this.Username = data.get(1).get(8);
        this.Password = data.get(1).get(9);
        this.Confirm = data.get(1).get(10);
    }
}