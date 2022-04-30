package ro.mycode.model.model;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Client {

    private int id;
    private String nume;
    private String prenume;
    private String iban;

}
