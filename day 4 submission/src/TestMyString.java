class MyString {
    char[] data;

    public MyString(char[] input) {
        data = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            data[i] = input[i];
        }
    }

    public MyString(String str) {
        data = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            data[i] = str.charAt(i);
        }
    }

    public int length() {
        return data.length;
    }

    public char charAt(int index) {
        if (index < 0 || index >= data.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return data[index];
    }

    public boolean equals(MyString other) {
        if (this.length() != other.length()) return false;
        for (int i = 0; i < data.length; i++) {
            if (this.data[i] != other.data[i]) return false;
        }
        return true;
    }

    public MyString toUpperCase() {
        char[] res = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= 'a' && data[i] <= 'z') {
                res[i] = (char)(data[i] - 32);
            } else {
                res[i] = data[i];
            }
        }
        return new MyString(res);
    }

    public MyString toLowercase() {
        char[] res = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= 'A' && data[i] <= 'Z') {
                res[i] = (char)(data[i] + 32);
            } else {
                res[i] = data[i];
            }
        }
        return new MyString(res);
    }

    public int indexOf(char ch) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public MyString concat(MyString other) {
        char[] res = new char[this.data.length + other.data.length];
        for (int i = 0; i < this.data.length; i++) {
            res[i] = this.data[i];
        }
        for (int i = 0; i < other.data.length; i++) {
            res[i + this.data.length] = other.data[i];
        }
        return new MyString(res);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char c : data) {
            sb.append(c);
        }
        return sb.toString();
    }

    public MyString replace(char oldchar, char newchar) {
        char[] res = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i] == oldchar)
                res[i] = newchar;
            else
                res[i] = data[i];
        }
        return new MyString(res);
    }

    public boolean contains(MyString sub) {
        int len = this.data.length;
        int len2 = sub.data.length;

        if (len2 > len) {
            return false;
        }

        for (int i = 0; i <= len - len2; i++) {
            int j;
            for (j = 0; j < len2; j++) {
                if (this.data[i + j] != sub.data[j]) {
                    break;
                }
            }
            if (j == len2) {
                return true;
            }
        }
        return false;
    }


    public MyString substring(int start, int end) {
        if (start < 0 || end > data.length || start > end) {
            throw new IndexOutOfBoundsException("Invalid range");
        }
        char[] res = new char[end - start];
        for (int i = start; i < end; i++) {
            res[i - start] = data[i];
        }
        return new MyString(res);
    }
}

public class TestMyString {
    public static void main(String[] args) {
        MyString str1 = new MyString("Rishab");
        MyString str2 = new MyString("an");

        System.out.println("Length: " + str1.length());
        System.out.println("Lowercase: " + str1.toLowercase().toString());
        System.out.println("Original: " + str1.toString());
        System.out.println("Contains 'an': " + str1.contains(str2));
        System.out.println("Char at 3: " + str1.charAt(3));
        System.out.println("Substring(0,4): " + str1.substring(0, 4).toString());
        System.out.println("Concat: " + str1.concat(str2).toString());
        System.out.println("Replace 'a' with 'x': " + str1.replace('a', 'x').toString());
        System.out.println("Uppercase: " + str1.toUpperCase().toString());
        System.out.println("Equals str2: " + str1.equals(str2));
    }
}
