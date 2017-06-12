package codebase.services_online.common;

import java.util.ArrayList;
import java.util.List;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/7/2017.
 */

public class RestResponseMessage<T> {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private List<RestErrorResponse> errors = new ArrayList<>();

    public List<RestErrorResponse> getErrors() {
        return errors;
    }

    public void setErrors(List<RestErrorResponse> errors) {
        this.errors = errors;
    }
}
