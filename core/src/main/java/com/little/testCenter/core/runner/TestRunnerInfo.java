package com.little.testCenter.core.runner;

import lombok.Data;
import com.alibaba.fastjson2.JSONObject;

import java.util.List;

/**
 * 测试运行消息
 *
 * @author yj6326076
 * @since 2023-04-09
 */
@Data
public class TestRunnerInfo {
    /** 测试步骤名称 */
    private String testName;

    /** 测试步骤id */
    private String testId;

    /** 测试步骤父id */
    private String parentId;

    /** testResult */
    private JSONObject testResult;
}
