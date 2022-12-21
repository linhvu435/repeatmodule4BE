package com.example.repeatmodule4.model;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;



@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull

    @Size(min = 6 , message = "UserName phải từ 6 kí tự trở lên")
    private String userName;
    @NotNull

    @Size(min = 6,max = 8,message = "Mật khẩu từ 6-8 kí tu")
    private String passWord;
    @Pattern(regexp = "(84|03|07|08|05)+([0-9]{8})\\b" , message = "Số điện thoại bắt đầu bằng 84")
    private String phoneNumber;
    @Email
    private String email;
    @Column(columnDefinition = "nvarchar(800)")
    private String address;
    private boolean status;
    @ManyToOne
    @JoinColumn(name = "id_role")
    private Roles roles;

    public Account() {
    }

    public Account(long id, String userName, String passWord, String phoneNumber, String email, String address, boolean status, Roles roles) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.status = status;
        this.roles = roles;
    }

}
