package com.little.testCenter.core.runner;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 基础测试信息
 *
 * @author yj6326076
 * @since 2023-04-09
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TestBaseRunnerInfo extends TestRunnerInfo{
    /** 子类信息 */
    private List<? extends TestRunnerInfo> children;
}
