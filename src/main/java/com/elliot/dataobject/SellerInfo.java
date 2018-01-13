package com.elliot.dataobject;

import lombok.Data;
import org.aspectj.lang.annotation.DeclareAnnotation;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author ShallowAn
 */
@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerid;

    private String username;

    private String password;

    private String openid;
}
