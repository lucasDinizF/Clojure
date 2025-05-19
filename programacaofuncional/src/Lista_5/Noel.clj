(ns Lista-5.Noel)

(defn aposta [[x y]]
  (let [lista []]
     (if (= (mod x y) 0) (cond (> y 5) (conj lista [y "Noel"])
                                (< y 5) (conj lista [y "Gnomos"]))
                         (recur [y (mod x y)]))))


(defn main []
  (let [n (take-while some? (repeatedly read-line))
        lista (map #(vec (map read-string (clojure.string/split % #" "))) n)
        num (map (fn [x] (get (last (aposta x)) 0)) lista)]
    (doall (map (fn [x] (println (get (last (aposta x)) 1))) lista))
    (print (clojure.string/join " " (reverse num)) "\n")))

(main)