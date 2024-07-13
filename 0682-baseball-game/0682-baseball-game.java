class Solution {
    public int calPoints(String[] operations) {
        List<Integer> answerList = new java.util.ArrayList<>(operations.length);
        for (String operation : operations) {
            switch (operation) {
                case "+":
                    answerList.add(answerList.get(answerList.size() - 1) + answerList.get(answerList.size() - 2));
                    break;
                case "D":
                    answerList.add(answerList.get(answerList.size() - 1) * 2);
                    break;
                case "C":
                    answerList.remove(answerList.size() - 1);
                    break;
                default:
                    answerList.add(Integer.parseInt(operation));
                    break;
            }
        }
        return answerList.stream().mapToInt(Integer::intValue).sum();
    }
}