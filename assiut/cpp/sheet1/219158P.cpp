#include <iostream>
#include <cmath>

using namespace std;

int main()
{
  int x;
  cin >> x;
  cout << (x / int(pow(10, int(log10(x)))) % 2 == 0 ? "EVEN" : "ODD") << endl;
  return 0;
}
