package com.ynm.gms;

public class UserInput {

    public static class TextInput {
        private String str = "";

        public void add(char c) {
            str = str + c;
        }

        public String getValue() {
            return str;
        }
    }

    public static class NumericInput extends TextInput {
        public void add(char c) {
            if (isNumeric(c)) {
                super.add(c);
            }
        }
    }

    private static boolean isNumeric(char c) {
        try {
            Double.parseDouble("" + c);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}