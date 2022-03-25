package thessarx;

public class Penghitungan {
        private Stack stack;
        private String masukan;
        private String hasil = "";

        public Penghitungan(String in) {
            masukan = in;
            int stackSize = masukan.length();
            stack = new Stack(stackSize);
        }

        public String doTrans() {
            for (int j = 0; j < masukan.length(); j++) {
                char ch = masukan.charAt(j);
                switch (ch) {
                    case '+':
                    case '-':
                        gotOper(ch, 1);
                        break;
                    case '*':
                    case '/':
                        gotOper(ch, 2);
                        break;
                    case '^':
                        gotOper(ch, 3);
                        break;
                    case '(':
                        stack.push(ch);
                        break;
                    case ')':
                        gotParen(ch);
                        break;
                    default:
                        hasil = hasil + ch;
                        break;
                }
            }
            while (!stack.isEmpty()) {
                hasil = hasil + stack.pop();
            }
            return hasil;
        }

        public void gotOper(char opThis, int prec1) {
            while (!stack.isEmpty()) {
                char opTop = (char) stack.pop();
                if (opTop == '(') {
                    stack.push(opTop);
                    break;
                }
                else {
                    int prec2;
                    if (opTop == '+' || opTop == '-')
                        prec2 = 1;
                    else if (opTop == '*' || opTop == '/')
                        prec2 = 2;
                    else
                        prec2 = 3;
                    if (prec2 < prec1)
                    {
                        stack.push(opTop);
                        break;
                    } else
                        hasil = hasil + opTop;
                }
            }
            stack.push(opThis);
        }

        public void gotParen(char ch){
            while (!stack.isEmpty()) {
                char chx = (char) stack.pop();
                if (chx == '(')
                    break;
                else
                    hasil = hasil + chx;
            }
        }
    }


