package pl.bogdank.txtstats.utils;

public class TextStatistics {

    private int countCharacters(String text) {
        return text.toCharArray().length;
    }

    private int countCharacters(String text, String noCount) {
        return text.replace(noCount, "").length();
    }

    private int countWords(String text) {
        String[] array = text.split(" ");
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].replace(" ", "").length() != 0)
                counter++;
        }
        return counter;
    }

    private boolean isPalindrome(String text) {
        char[] charArray = text.toCharArray();
        boolean result = true;
        for (int i = 0, j = charArray.length-1 ; i <= j ; i++, j--) {
            if(charArray[i] != charArray[j]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public String printInfo(String text) {
        return "<html><head><meta charset=\"UTF-8\"><style>body{margin-left: 100px;margin-right: 100px;}</style></head><body><p>" + text + "<br/>" +
                "<h1>Ilość słów: " + countWords(text) +"</h1><h1>Ilość znaków: " + countCharacters(text)+"</h1>" +
                "<h1>Ilość znaków (bez spacji): "  + countCharacters(text, " ")+ "</h1>" +
                "<h1>Palindrom: "+ isPalindrome(text)+ "</h1></body></html>";
    }

}
