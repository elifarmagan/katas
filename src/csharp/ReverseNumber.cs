using System.Text;

namespace csharp {
    public class ReverseNumber {
        public int Reverse(int number) {
            bool isNegative = false;
            if (number < 0) {
                number = number * -1;
                isNegative = true;
            }
            int result;
            StringBuilder sb = new StringBuilder();
            while (number > 0) {
                sb.Append(number % 10);
                number = number / 10;
            }
            int.TryParse(sb.ToString(), out result);
            return !isNegative ? result : -result;
        }
    }
}
