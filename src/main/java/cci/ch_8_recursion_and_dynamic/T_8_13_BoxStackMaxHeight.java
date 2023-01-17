package cci.ch_8_recursion_and_dynamic;

import java.util.ArrayList;
import java.util.List;

public class T_8_13_BoxStackMaxHeight {

    public static int getMaxHeight(List<Box> boxes) {
        List<Box> sortedBoxes = new ArrayList<>(boxes);
        sortedBoxes.sort((b1, b2) -> b2.getHeight() - b1.getHeight());
        int maxHeight = 0;
        int[] memo = new int[boxes.size()];
        for (int i = 0; i < boxes.size(); i++) {
            maxHeight = Math.max(maxHeight, getMaxHeight(sortedBoxes, i, memo));
        }
        return maxHeight;
    }

    private static int getMaxHeight(List<Box> boxes, int bottomInd, int[] memo) {
        if (memo[bottomInd] > 0) {
            return memo[bottomInd];
        }
        int maxHeight = 0;
        Box bottomBox = boxes.get(bottomInd);
        for (int i = bottomInd + 1; i < boxes.size(); i++) {
            if (boxes.get(i).canBePlacedOnTopOf(bottomBox)) {
                maxHeight = Math.max(maxHeight, getMaxHeight(boxes, i, memo));
            }
        }
        maxHeight += bottomBox.getHeight();
        return maxHeight;
    }

    public static class Box {
        private final int height;
        private final int width;
        private final int depth;

        public Box(int height, int width, int depth) {
            this.height = height;
            this.width = width;
            this.depth = depth;
        }

        public int getHeight() {
            return height;
        }

        public int getWidth() {
            return width;
        }

        public int getDepth() {
            return depth;
        }

        public boolean canBePlacedOnTopOf(Box box) {
            return this.getHeight() < box.getHeight()
                    && this.getDepth() < box.getDepth()
                    && this.getWidth() < box.getWidth();
        }
    }
}


