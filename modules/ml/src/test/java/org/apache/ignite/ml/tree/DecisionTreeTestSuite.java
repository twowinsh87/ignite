/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.ml.tree;

import org.apache.ignite.ml.tree.data.DecisionTreeDataTest;
import org.apache.ignite.ml.tree.impurity.gini.GiniImpurityMeasureCalculatorTest;
import org.apache.ignite.ml.tree.impurity.gini.GiniImpurityMeasureTest;
import org.apache.ignite.ml.tree.impurity.mse.MSEImpurityMeasureCalculatorTest;
import org.apache.ignite.ml.tree.impurity.mse.MSEImpurityMeasureTest;
import org.apache.ignite.ml.tree.impurity.util.SimpleStepFunctionCompressorTest;
import org.apache.ignite.ml.tree.impurity.util.StepFunctionTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test suite for all tests located in {@link org.apache.ignite.ml.tree} package.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    DecisionTreeClassificationTrainerTest.class,
    DecisionTreeRegressionTrainerTest.class,
    DecisionTreeDataTest.class,
    GiniImpurityMeasureCalculatorTest.class,
    GiniImpurityMeasureTest.class,
    MSEImpurityMeasureCalculatorTest.class,
    MSEImpurityMeasureTest.class,
    StepFunctionTest.class,
    SimpleStepFunctionCompressorTest.class,
    DecisionTreeRegressionTrainerIntegrationTest.class,
    DecisionTreeClassificationTrainerIntegrationTest.class
})
public class DecisionTreeTestSuite {
}
