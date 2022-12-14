import { IStack } from '../../Interfaces';

export class Stack<T> implements IStack<T> {
  private readonly items: T[] = [];
  push(...item: T[]): void {
    this.items.push(...item);
  }
  pop(): T | undefined {
    return this.items.pop();
  }
  peek(): T {
    return this.items[this.items.length - 1];
  }
  size(): number {
    return this.items.length;
  }

  isEmpty(): boolean {
    return this.items.length === 0;
  }

  getItem(index: number): T {
    if (index + 1 > this.size()) {
      return this.items[this.size() - 1];
    }
    return this.items[index];
  }
}
