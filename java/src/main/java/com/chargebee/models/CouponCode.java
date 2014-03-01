package com.chargebee.models;

import com.chargebee.*;
import com.chargebee.internal.*;
import com.chargebee.internal.HttpUtil.Method;
import com.chargebee.models.enums.*;
import org.json.*;
import java.io.*;
import java.sql.Timestamp;
import java.util.*;

public class CouponCode extends Resource<CouponCode> {

    //Constructors
    //============

    public CouponCode(String jsonStr) {
        super(jsonStr);
    }

    public CouponCode(JSONObject jsonObj) {
        super(jsonObj);
    }

    // Fields
    //=======

    public String code() {
        return reqString("code");
    }

    public String couponId() {
        return reqString("coupon_id");
    }

    public String couponSetName() {
        return reqString("coupon_set_name");
    }

    // Operations
    //===========

    public static CreateRequest create() throws IOException {
        String uri = uri("coupon_codes");
        return new CreateRequest(Method.POST, uri);
    }

    public static Request retrieve(String id) throws IOException {
        String uri = uri("coupon_codes", nullCheck(id));
        return new Request(Method.GET, uri);
    }


    // Operation Request Classes
    //==========================

    public static class CreateRequest extends Request<CreateRequest> {

        private CreateRequest(Method httpMeth, String uri) {
            super(httpMeth, uri);
        }
    
        public CreateRequest couponId(String couponId) {
            params.add("coupon_id", couponId);
            return this;
        }

        public CreateRequest couponSetName(String couponSetName) {
            params.add("coupon_set_name", couponSetName);
            return this;
        }

        public CreateRequest code(String code) {
            params.add("code", code);
            return this;
        }

        @Override
        public Params params() {
            return params;
        }
    }

}