#include <iostream>

using namespace std;

int main()
{
  double x;
  cin >> x;
  if(x < 0 || x > 100)
  {
    cout << "Out of Intervals" << endl;
    return 0;
  }
   cout << "Interval ";
  int i;
  for(i = 0; i <= 3 && x - i * 25 > 25; i++);
  cout << (i == 0 ? '[' : '(') << i * 25 << ',';
  for(i = 1; i <= 4 && x > i * 25; i++);
  cout << i * 25 << ']' << endl;
  return 0;
}
