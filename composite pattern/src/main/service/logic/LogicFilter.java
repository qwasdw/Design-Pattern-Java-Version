package main.service.logic;

import main.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

public interface LogicFilter {

    /**
     * 逻辑决策器
     * @param matterValue
     * @param treeNodeLinkList
     * @return
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList);

    /**
     * 获取决策值
     * @param treeId
     * @param userId
     * @param decisionMatter
     * @return
     */
    String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);
}
