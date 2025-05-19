(ns Lista-5.fibonacci)

(defn fib [x y z op]
  (if (<= z 0) x
               (recur y (op x y) (dec z) op)))

(defn main []
  (let [n (read)
        lista (repeatedly n read)
        resultados (map (fn [x] ((partial fib 0 0) x (fn [x y] (+ x y 2)))) lista)
        chamadas (map (fn [x] ((partial fib 0 1) x (fn [x y] (+ x y)))) lista)]

    (doall (map (fn [x y z] (println (str "fib(" x ") = " y " calls = " z))) lista resultados chamadas))))

(main)
