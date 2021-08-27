package com.minwk.construct.design.chain;

/**
 * 抽象处理角色
 *
 * @author MinWeikai
 * @date 2021/8/26 16:23
 */
public abstract class AbstractHandler {

    /**
     * 保护伞
     */
    private AbstractHandler umbrella;

    /**
     * 保护伞名字
     */
    private String name;

    /**
     * 处理等级
     */
    private String handleLevel;

    /**
     * 需要处理的请求
     *
     * @param request
     */
    public void handleRequest(String request) {
        System.out.println(this.name.concat("接收：")
                .concat(request));
        if (request.contains(this.handleLevel)) {
            this.handleBySelf(request);
        } else {
            if (this.getUmbrella() != null) {
                this.handleByUmbrella();
                this.getUmbrella().handleRequest(request);
            } else {
                this.helplessSay(request);
            }
        }
    }

    /**
     * 自己处理，不同的职责有不同的实现
     *
     * @param request
     */
    public abstract void handleBySelf(String request);

    /**
     * 交给保护伞，各个职责动作一致
     */
    public void handleByUmbrella() {
        System.out.println(this.getName()
                .concat("处理不了这个请求")
                .concat("交给了保护伞")
                .concat(this.getUmbrella().getName())
                .concat("解决"));
    }

    /**
     * 不同职责，没有保护伞，无助时说的话也不一样
     *
     * @param request
     */
    public abstract void helplessSay(String request);

    public String getHandleLevel() {
        return handleLevel;
    }

    public void setHandleLevel(String handleLevel) {
        this.handleLevel = handleLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractHandler getUmbrella() {
        return umbrella;
    }

    public void setUmbrella(AbstractHandler umbrella) {
        this.umbrella = umbrella;
    }
}
