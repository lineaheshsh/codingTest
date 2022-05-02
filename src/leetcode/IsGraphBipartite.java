package leetcode;

import java.util.*;

public class IsGraphBipartite {
    public static boolean isBipartite(int[][] graph) {
        int[] colors = new int[graph.length];
        Arrays.fill(colors, -1);
        System.out.println("colors : " + Arrays.toString(colors));
        int color = 0;
        for (int i = 0; i < graph.length; i++) {
            if (colors[i] == -1) {
                if (!dfs(graph, colors, i, (color+1) % 2)) {
                    return false;
                }
            }
        }

        System.out.println(Arrays.toString(colors));
        return true;
    }

    public static boolean dfs(int[][] graph, int[] colors, int vertex, int color) {
        System.out.println("graph : " + Arrays.toString(graph[vertex]) + ", colors : " + Arrays.toString(colors) + ", vertex : " + vertex + ", color : " + color);
        if (colors[vertex] != -1 && colors[vertex] != color) {
            return false;
        }

        if (colors[vertex] != -1) {
            return true;
        }
        colors[vertex] = color;

        for (int v : graph[vertex]) {
            System.out.println("v : " + v);
            if (!dfs(graph, colors, v, (color + 1) % 2)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][][] graphArr = {
                {{1,2,3},{0,2},{0,1,3},{0,2}},
                {{1,3},{0,2},{1,3},{0,2}},
                {{4,1},{0,2},{1,3},{2,4},{3,0}}
        };

        for (int[][] g : graphArr) {
            System.out.println(isBipartite(g));
        }
    }
}
