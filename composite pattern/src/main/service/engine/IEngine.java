package main.service.engine;

import main.model.aggregates.TreeRich;
import main.model.vo.EngineResult;

import java.util.Map;

public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich,
                         final Map<String, String> decisionMatter);
}
