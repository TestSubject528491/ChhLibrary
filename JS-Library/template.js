// to create a Class's constructor:
function Person(fname, lname, age) {
  // to create private instance fields (only accessible to constructor)
  var birth_year = 2014 - age;

  // to create public instance fields (accessible to outside):
  this.whole_name = fname + ' ' + lname;

  // to create private instance methods:
  // (must be inner functions inside constructor, only accessible to constructor)
  function agePlusTwo() { return age + 2;}

  // to create "privelaged" instance methods
  // (has access to private fields and methods but is itself accessible to the outside)
  // better than public instance methods but takes up more space
  this.setBirthYear = function (changed) { birth_year = changed; return true;}
}

// to create public instance methods:
Person.prototype.getWholeName = function () { return ???.whole_name; } ????????????????????????????

// to create public STATIC fields:
var Person.IS_HUMAN = true;

// to create public STATIC methods:
Person.SPECIES = function(language) {
  switch(language) {
    case 'Latin':
      return 'sapien';
    case 'English':
      return 'human';
    default:
      return null;
  }
}

// to create Global (STATIC) fields:
var pi = 3.14;

// to create Global (STATIC) methods:
function add(x, y) { return x + y; }



// to create a new object:
var me = new Person('Chris', 'Harvey', 26);

// to get public instance fields:
console.log(me.whole_name);

// to call privelaged instance methods:
console.log(me.setBirthYear(1987));

// to call public instance methods:
console.log(Person.prototype.getWholeName()); ?????????????????????????????????????????????????????

// to call public STATIC fields:
console.log(Person.IS_HUMAN);

// to call public STATIC methods:
console.log(Person.SPECIES('Latin'));

// to call Global fields:
console.log(pi);

// to call Global methods:
console.log(add(2, 3));
