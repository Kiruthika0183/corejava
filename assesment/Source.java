
package assesment;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> cg=Stream.of("Capgimini");
		/*CharSequence inputText;
		inputText.chars()
		.filter(c->c!=' ')
		.map(c->c^random.nextInt(randbound)
		.mapToObj(i->String.format("%05X",i&0XFFFFF) 
		.collect(joining(")";*/
		
		System.out.println(cg.map( (s->{
			s.insertSpace(cg);
			
			s.toString();
			return s.addSpace("capgimini");
			})));
	
			
			
		}}		