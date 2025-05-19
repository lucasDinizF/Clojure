(ns Lista-3.pum)

(defn sequencia [x]
  (println (str x " " ((fn [x] (+ x 1)) x) " " ((fn [x] (+ x 2)) x) " PUM")))

(defn main []
  (let [n (read)]
    (doall (map sequencia (range 1 (* n 4) 4)))))

(main)