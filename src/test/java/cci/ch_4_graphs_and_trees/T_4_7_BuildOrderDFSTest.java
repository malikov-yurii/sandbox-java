package cci.ch_4_graphs_and_trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class T_4_7_BuildOrderDFSTest {

    @Test
    void buildOrder() {
        //given
        String[] projects = new String[]{"a", "b", "c", "d", "e", "f"};
        ProjectDependency[] relations = new ProjectDependency[]{
                new ProjectDependency("a", "d"),
                new ProjectDependency("f", "b"),
                new ProjectDependency("b", "d"),
                new ProjectDependency("f", "a"),
                new ProjectDependency("d", "c"),
        };

        //when
        List<String> projectOrder = T_4_7_BuildOrderDFS.buildOrder(projects, relations);

        //then
        System.out.println(projectOrder);
        assertThat(projectOrder.indexOf("a")).isLessThan(projectOrder.indexOf("d"));
        assertThat(projectOrder.indexOf("f")).isLessThan(projectOrder.indexOf("b"));
        assertThat(projectOrder.indexOf("b")).isLessThan(projectOrder.indexOf("d"));
        assertThat(projectOrder.indexOf("f")).isLessThan(projectOrder.indexOf("a"));
        assertThat(projectOrder.indexOf("d")).isLessThan(projectOrder.indexOf("c"));
        assertThat(projectOrder.size()).isEqualTo(projects.length);
    }
}