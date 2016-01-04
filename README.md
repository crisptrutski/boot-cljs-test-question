# boot-cljs-test-question
This project targets node js.

Why are symbols like async, deftest, testing all not recognized on line 2 of test/silliness/core_test.cljs?

To see, run boot auto-test

    WARNING: Use of undeclared Var silliness.core-test/async at line 2 test/silliness/core_test.cljs
    WARNING: Use of undeclared Var silliness.core-test/deftest at line 2 test/silliness/core_test.cljs
    WARNING: Use of undeclared Var silliness.core-test/testing at line 2 test/silliness/core_test.cljs
    WARNING: Use of undeclared Var silliness.core-test/is at line 2 test/silliness/core_test.cljs
    WARNING: Use of undeclared Var silliness.core-test/silly at line 3 test/silliness/core_test.cljs
    WARNING: Use of undeclared Var silliness.core-test/deftest at line 5 test/silliness/core_test.cljs
    WARNING: Use of undeclared Var silliness.core-test/silly-test at line 5 test/silliness/core_test.cljs
    WARNING: Use of undeclared Var silliness.core-test/is at line 6 test/silliness/core_test.cljs
    WARNING: Use of undeclared Var silliness.core-test/silly at line 6 test/silliness/core_test.cljs
    Running cljs tests...
    /home/fhenderson/.boot/cache/tmp/home/fhenderson/cljs/boot-cljs-test-question/ed5/f0sqpx/output.out/silliness/core_test.js:5
    est.is.call(null,cljs.core._EQ_.call(null,silliness.core_test.silly.call(null)
                                                                        ^
    TypeError: Cannot call method 'call' of undefined
        at Object.<anonymous> (/home/fhenderson/.boot/cache/tmp/home/fhenderson/cljs/boot-cljs-test-question/ed5/f0sqpx/output.out/silliness/core_test.js:5:154)
