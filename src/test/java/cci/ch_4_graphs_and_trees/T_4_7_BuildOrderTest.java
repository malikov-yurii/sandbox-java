package cci.ch_4_graphs_and_trees;

import exception.NoBuildOrderExistsException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class T_4_7_BuildOrderTest {

    @Test
    void buildOrderExists() {
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
        List<String> projectOrder = T_4_7_BuildOrder.buildOrder(projects, relations);

        //then
        System.out.println(projectOrder);
        assertThat(projectOrder.indexOf("a")).isLessThan(projectOrder.indexOf("d"));
        assertThat(projectOrder.indexOf("f")).isLessThan(projectOrder.indexOf("b"));
        assertThat(projectOrder.indexOf("b")).isLessThan(projectOrder.indexOf("d"));
        assertThat(projectOrder.indexOf("f")).isLessThan(projectOrder.indexOf("a"));
        assertThat(projectOrder.indexOf("d")).isLessThan(projectOrder.indexOf("c"));
        assertThat(projectOrder.size()).isEqualTo(projects.length);
    }

    @Test
    void buildOrderExists2() {
        //given
        String[] projects = new String[]{"a", "b", "c", "d", "e", "f", "g"};
        ProjectDependency[] relations = new ProjectDependency[]{
                new ProjectDependency("d", "g"),
                new ProjectDependency("f", "a"),
                new ProjectDependency("f", "b"),
                new ProjectDependency("f", "c"),
                new ProjectDependency("c", "a"),
                new ProjectDependency("b", "a"),
                new ProjectDependency("b", "e"),
                new ProjectDependency("a", "e"),
        };

        //when
        List<String> projectOrder = T_4_7_BuildOrder.buildOrder(projects, relations);

        //then
        System.out.println(projectOrder);
        assertThat(projectOrder.indexOf("d")).isLessThan(projectOrder.indexOf("g"));
        assertThat(projectOrder.indexOf("f")).isLessThan(projectOrder.indexOf("a"));
        assertThat(projectOrder.indexOf("f")).isLessThan(projectOrder.indexOf("b"));
        assertThat(projectOrder.indexOf("f")).isLessThan(projectOrder.indexOf("c"));
        assertThat(projectOrder.indexOf("c")).isLessThan(projectOrder.indexOf("a"));
        assertThat(projectOrder.indexOf("b")).isLessThan(projectOrder.indexOf("a"));
        assertThat(projectOrder.indexOf("b")).isLessThan(projectOrder.indexOf("e"));
        assertThat(projectOrder.indexOf("a")).isLessThan(projectOrder.indexOf("e"));
        assertThat(projectOrder.size()).isEqualTo(projects.length);
    }

    @Test
    void buildOrderDoesNotExist() {
        //given
        String[] projects = new String[]{"a", "b", "c", "d"};
        ProjectDependency[] relations = new ProjectDependency[]{
                new ProjectDependency("a", "b"),
                new ProjectDependency("b", "c"),
                new ProjectDependency("c", "d"),
                new ProjectDependency("d", "a"),
        };

        //then
        assertThatThrownBy(() -> T_4_7_BuildOrder.buildOrder(projects, relations))
                .isInstanceOf(NoBuildOrderExistsException.class);
    }

    @Test
    void buildOrderDoesNotExist2() {
        //given
        String[] projects = new String[]{"a", "b", "c", "d"};
        ProjectDependency[] relations = new ProjectDependency[]{
                new ProjectDependency("a", "b"),
                new ProjectDependency("b", "a"),
        };

        //then
        assertThatThrownBy(() -> T_4_7_BuildOrder.buildOrder(projects, relations))
                .isInstanceOf(NoBuildOrderExistsException.class);
    }

    @Test
    void buildOrderDoesNotExist3() {
        //given
        String[] projects = new String[]{"a", "b", "c", "d"};
        ProjectDependency[] relations = new ProjectDependency[]{
                new ProjectDependency("b", "c"),
                new ProjectDependency("c", "d"),
                new ProjectDependency("d", "b"),
                new ProjectDependency("a", "c"),
        };

        //then
        assertThatThrownBy(() -> T_4_7_BuildOrder.buildOrder(projects, relations))
                .isInstanceOf(NoBuildOrderExistsException.class);
    }

}