(ns Lista-5.figurinhas)

(defn figurinhas [[x y]]
  (if (= (mod x y) 0) y
                      (recur [y (mod x y)])
                      ))

(defn main []
  (let [n (read)
        lista (repeatedly n #(repeatedly 2 read))]
    (doall (map (fn [x] (println (figurinhas x))) lista))))

(main)