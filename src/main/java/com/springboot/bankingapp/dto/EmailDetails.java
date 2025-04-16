package com.springboot.bankingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data se usa en los dto y @Getter y @Setter en la clase entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class EmailDetails {
   private String recipient; //es el mail del usuario creado (a quien se le envía el mail)
   private String messageBody;
   private String subject;
   private String attachment;

}
