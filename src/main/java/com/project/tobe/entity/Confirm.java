
package com.project.tobe.entity;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Confirm {

    private Long confirmNo;
    private String confirmStatus;
    private String confirmTitle;
    private String confirmContent;
    private LocalDate confirmRegDate;
    private LocalDate confirmConfirmDate;
    private String employeeId;//fk
    private Long orderNo; //fk

    private OrderH orderH;
    private Employee employee;
}