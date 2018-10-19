#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main()
{
  string file, holder;
  int sum = 0;
  cout<<"Enter the file name: ";
  cin>>file;

  ifstream ifs(file.c_str());

  if(!ifs)
  {
    cout<<"File is not Found!!!"<<endl;
    exit(0);
  }
  while(getline(ifs, holder))
  {
    sum += stoi(holder.c_str());
  }
  cout<<sum<<endl;
}