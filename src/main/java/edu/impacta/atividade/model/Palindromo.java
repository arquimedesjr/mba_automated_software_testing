package edu.impacta.atividade.model;

public class Palindromo {

    private String text;

    public Palindromo(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public boolean validText() {
        if (text == null || text.equals(""))
            throw new IllegalArgumentException("is null");

        int textLength = text.length();

        StringBuilder reverseStr = new StringBuilder();

        for (int i = (textLength - 1); i >= 0; --i) reverseStr.append(text.charAt(i));

        return text.toLowerCase().equals(reverseStr.toString().toLowerCase());
    }

}
