MathJax.Hub.Config({
	messageStyle: 'normal',
	menuSettings: {
		zoom: 'None',
		zscale: '150%'
	},
	tex2jax: {
		// see http://docs.mathjax.org/en/latest/options/tex2jax.html
		inlineMath:  [ ['\\(' , '\\)'] ],
		displayMath: [ ['\\[' , '\\]'] ],
		skipTags: ['script','noscript','style','textarea','pre','code'],
		processClass: 'M'
	},
	TeX: {
		// see http://docs.mathjax.org/en/latest/options/TeX.html
		extensions: ['action.js'],
// 		equationNumbers: {autoNumber: 'AMS'},
		Macros: {
//			bold: ['{\\bf #1}',1], // template
			expand: ['{\\left\(\\toggle\{#1\}\{#2\}\\endtoggle\\right\)}',2],
			l: ['{\\mathsf #1}',1], // propositional variables, predicates
			lnor: '\\Downarrow', // joint denial (negated disjunction)
			lnand: '\\Uparrow', // alternative denial (
			lxor: '\\nLeftrightarrow', // exclusive disjunction ('xor')
			NN: '{\\mathbb N}', // natural numbers
			ZZ: '{\\mathbb Z}', // integers
			QQ: '{\\mathbb Q}', // rational numbers
			RR: '{\\mathbb R}', // real numbers
			CC: '{\\mathbb C}'  // complex numbers
		}
	},
	'HTML-CSS': {
		// see http://docs.mathjax.org/en/latest/options/HTML-CSS.html
	}
});

MathJax.Ajax.loadComplete('http://chharvey.github.io/chhlib/mathjax-localconfig.js');
