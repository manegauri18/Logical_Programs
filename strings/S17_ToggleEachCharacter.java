package strings;

class S17_ToggleEachCharacter {
    public static void main(String[] args) {
        String input = "HeLLo WoRLd 123!";
        StringBuilder toggled = new StringBuilder();

        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch))
            {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else 
            {
                toggled.append(ch); // Keep non-alphabetic characters unchanged
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Toggled: " + toggled.toString());
    }
}