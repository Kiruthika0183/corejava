package oops;
class bank
{
	int getRatesOfInterest()
	{
		return 0;
	}}
class SBI extends bank
{
	int getRatesOfInterest()
	{
		return 7;
	}}

class ICIC extends bank
{
int getRatesOfInterest()
{
	return 8;
}}

class AXIS extends bank
{
	int getRatesOfInterest()
	{
		return 9;
	}} 

public class OverridingEx {
	
public static void main(String []args) {
	SBI s=new SBI();
	ICIC i=new ICIC();
	AXIS a=new AXIS();
	System.out.println("SBI rates of Interest "  +s.getRatesOfInterest());
	System.out.println("ICIC rates of Interest "  +i.getRatesOfInterest());
	System.out.println("AXIS rates of Interest "  +a.getRatesOfInterest());
	
}}



