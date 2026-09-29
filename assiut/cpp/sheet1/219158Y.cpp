#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
  long long n;
  int result = 1;
  for(int i: {0, 1, 2, 3})
  {
    cin >> n;
    result *= n % 100;
  }
  cout << std::setfill('0') << std::setw(2) << result % 100 << endl;
  return 0;
}
