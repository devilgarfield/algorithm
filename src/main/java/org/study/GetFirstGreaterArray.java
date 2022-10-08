package org.study;

import java.util.Stack;

public class GetFirstGreaterArray {
    /**
     * 给定如下数组
     * [2,6,7,5,11]
     * 找到每个元素右边第一个比自己大的数
     * 输出如下结果
     * [6,7,11,11,-1]
     */
    public static int[] calculateFirstRightGreaterArray(int[] candidateArray) {
        if (candidateArray.length == 0) {
            return null;
        } else {
            Stack<Integer> stack = new Stack<>();
            int[] res = new int[candidateArray.length];

            for (int i = 0; i < candidateArray.length; i++) {
                if (!stack.isEmpty() && candidateArray[stack.peek()] < candidateArray[i]) {
                    while (!stack.isEmpty()) {
                        Integer index = stack.pop();//小值的索引出栈
                        res[index] = candidateArray[i];
                    }
                    stack.push(i);//大值的索引入栈
                } else stack.push(i);
            }
            while (!stack.empty()) {
                res[stack.pop()] = -1;
            }
            return res;
        }
    }
}
