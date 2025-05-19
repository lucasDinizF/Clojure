(ns Lista-2.lanche)

(defn cardapio [x y]
  (cond (= x 1)
        (* 4.00 y)
        (= x 2)
        (* 4.50 y)
        (= x 3)
        (* y 5.00)
        (= x 4)
        (* y 2.00)
        (= x 5)
        (* y 1.50)))

(defn main []
  (let [x (read)
        y (read)]
    (println "Total: R$" (format "%.2f" (cardapio x y)))))

(main)