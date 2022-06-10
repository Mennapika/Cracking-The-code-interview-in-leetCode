boolean isUnique(string str)
{
  if(str.length()>128 || str==null)
  {
    return false;;
  }
  boolean[] set= new boolean[128];
  for(int i =0 ; i<str.lengthh();i++)
  {
    int val= str.charAt(i);
    if(set[i])
    {
      return false;
  }
    set[i]=true;
  }
  return true 
}
