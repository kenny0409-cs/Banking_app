package net.studies.banking.app.dto;

/*import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private Double balance;
}*/

public record AccountDto(Long id,String accountHolderName, double balance){

}
