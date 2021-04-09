package com.seven.springboot.vo.ly;

import com.seven.springboot.common.Contrast;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo {
    private Integer code;
    private String message;
    private Object data;

    public ResultVo(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    
    public static final ResultVo ADD_SUCCESS=new ResultVo(Contrast.OK, Contrast.ADD_SUCCESS);
    public static final ResultVo ADD_ERROR=new ResultVo(Contrast.ERROR, Contrast.ADD_ERROR);

    public static final ResultVo DELETE_SUCCESS = new ResultVo(Contrast.OK, Contrast.DELETE_SUCCESS);
    public static final ResultVo DELETE_ERROR = new ResultVo(Contrast.ERROR, Contrast.DELETE_ERROR);

    public static final ResultVo UPDATE_SUCCESS = new ResultVo(Contrast.OK, Contrast.UPDATE_SUCCESS);
    public static final ResultVo UPDATE_ERROR = new ResultVo(Contrast.ERROR, Contrast.UPDATE_ERROR);

    public static final ResultVo QUERY_ERROR = new ResultVo(Contrast.ERROR, Contrast.QUERY_ERROR);
}
