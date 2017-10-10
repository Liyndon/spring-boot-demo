package com.wiserv.api;

import com.wiserv.global.ControllerDefs;
import com.wiserv.global.ControllerResult;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lixy on 2017/9/15.
 */
@RestController
@RequestMapping(value = ControllerDefs.BIZ_CTRL_PREFIX + ControllerDefs.VERSION)
@Api(value = "测试类", description = "App相关操作接口定义类")
@Slf4j
public class DemoController {

    @PreAuthorize("hasRole('ROLE_USER')")
    @ApiOperation(httpMethod = "GET", value = "test1", tags = "测试", notes = "测试")
    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public ResponseEntity test1(@ApiParam(value = "name", required = true) String name) {
        return ControllerResult.success();
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @ApiOperation(httpMethod = "GET", value = "test2", tags = "测试")
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public ResponseEntity test2() {
        return ControllerResult.success();
    }
    
    @ApiOperation(httpMethod = "GET", value = "test3", tags = "测试")
    @RequestMapping(value = "/test3", method = RequestMethod.GET)
    public ResponseEntity test3() {
        return ControllerResult.success();
    }

    @ApiOperation(value = "测试更新", tags = "测试", notes = "测试更新不可描述")
    @RequestMapping(value = "/users/{id}", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "userName", value = "用户名称", paramType = "form", dataType = "string")})
    public ResponseEntity updateUserName(@PathVariable Integer id, @RequestParam String userName) {
        return ControllerResult.success();
    }


    /**
     * paramType：参数放在哪个地方header–>请求参数的获取：
     *
     * @RequestHeaderquery–>请求参数的获取：
     * @RequestParampath（用于restful接口）–>请求参数的获取：
     * @PathVariablebody（不常用）form（不常用） name：参数名
     * dataType：参数类型
     * required：参数是否必须传
     * value：参数的意思
     * defaultValue：参数的默认值
     */

    @ApiOperation(value = "获取用户详细信息", tags = "测试", notes = "根据url的id来获取用户详细信息", produces = "application/json")
    // ApiResponses 增加返回结果的描述
    @ApiResponses(value = {@ApiResponse(code = 200, message = "sadasdasdasds")})
    @ApiImplicitParam(name = "id", value = "用户ID", dataType = "int", paramType = "path")
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public ResponseEntity getUser(@PathVariable Integer id) {
        return ControllerResult.success("");
    }


}
